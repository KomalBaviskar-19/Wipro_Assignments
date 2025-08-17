package com.wipro.komal.hibernate.schoolapp;

import com.wipro.komal.hibernate.schoolapp.entity.Gender;
import com.wipro.komal.hibernate.schoolapp.entity.SchoolUser;
import com.wipro.komal.hibernate.schoolapp.util.SchoolAppUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import java.time.LocalDate;

public class SchoolApp {

    public static void main(String[] args) {

        System.out.println("Starting SchoolApp...");

        try {
            // Initial creation and insertion
            Session session = SchoolAppUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            
            // Generate a unique username to avoid the ConstraintViolationException
            String uniqueUsername = "Komal" + System.currentTimeMillis();
            
            SchoolUser user = new SchoolUser();
            user.setFirstname("Komal");
            user.setLastname("Baviskar");
            user.setUsername(uniqueUsername);
            user.setGender(Gender.FEMALE);
            user.setAddress("Pune");
            user.setDob(LocalDate.of(2002, 4, 19));
            	
            session.persist(user);
            tx.commit();
            session.close();

            System.out.println("User inserted into Database: " + user);

            // Fetch the user from the database
            session = SchoolAppUtil.getSessionFactory().openSession();
            SchoolUser userData = session.get(SchoolUser.class, user.getRollno());
            System.out.println("User fetched from Database: " + userData);
            session.close();

            // Update the user
            session = SchoolAppUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            userData.setFirstname("komu"); // Change the name
            session.merge(userData); 
            tx.commit();
            session.close();
            System.out.println("User updated: " + userData);
//            
//            // Delete the user
            session = SchoolAppUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.remove(session.merge(userData));
            tx.commit();
            session.close();

            System.out.println("User with rollno " + userData.getRollno() + " deleted successfully.");
            System.out.println("Fetching user to confirm deletion...");
            

        } catch (ConstraintViolationException e) {
            System.err.println("Error: A unique constraint was violated. This usually happens when trying to insert a user that already exists.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}