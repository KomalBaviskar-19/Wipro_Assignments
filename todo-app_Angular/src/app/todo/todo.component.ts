import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-todo',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent {
  newTask: string = '';
  tasks: { name: string, editing: boolean, completed: boolean }[] = [];

  addTask() {
    if (this.newTask.trim()) {
      this.tasks.push({ name: this.newTask.trim(), editing: false, completed: false });
      this.newTask = '';
    }
  }

  editTask(task: any) {
    task.editing = true;
  }

  updateTask(task: any, newName: string) {
    if (newName.trim()) {
      task.name = newName.trim();
      task.editing = false;
    }
  }

  toggleCompleted(task: any) {
    task.completed = !task.completed;
  }

  deleteTask(index: number) {
    this.tasks.splice(index, 1);
  }
}
