import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';

type Movie = {
  title: string;
  year: number;
  genre: string;
  rating: number;      // 1–5
  description: string;
  poster: string;      // direct URL (Wikimedia)
};

@Component({
  selector: 'app-movie-list',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatIconModule, MatFormFieldModule, MatSelectModule],
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  selectedGenre: string = 'All';

  movies: Movie[] = [
    {
      title: 'Saiyaara',
      year: 2010,
      genre: 'Romance',
      rating: 5,
      description: 'A thief who infiltrates dreams to steal corporate secrets faces his toughest job.',
      poster:'https://stat4.bollywoodhungama.in/wp-content/uploads/2025/05/Saiyaara01.jpg'
    },
    {
      title: 'Interstellar',
      year: 2014,
      genre: 'Adventure',
      rating: 4,
      description: 'Explorers travel through a wormhole in space to ensure humanity’s survival.',
      poster: 'https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg'
    },
    {
      title: 'Baahubali',
      year: 2008,
      genre: 'Action',
      rating: 5,
      description: 'Batman faces the Joker in a battle for Gotham’s soul.',
      poster: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQK1_bx8BM-SAySd3e74MFrhQ8voF84m7-_7w&s'
    },
    {
      title: 'Avatar',
      year: 2009,
      genre: 'Sci-Fi',
      rating: 4,
      description: 'A marine on Pandora becomes torn between following orders and protecting his new home.',
      poster: 'https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg'
    }
    // {
    //   title: 'Titanic',
    //   year: 1997,
    //   genre: 'Romance',
    //   rating: 4,
    //   description: 'A love story aboard the ill-fated RMS Titanic.',
    //   poster: 'https://upload.wikimedia.org/wikipedia/en/2/22/Titanic_poster.jpg'
    // },
    // {
    //   title: 'The Matrix',
    //   year: 1999,
    //   genre: 'Sci-Fi',
    //   rating: 5,
    //   description: 'A hacker discovers reality is a simulation and learns to bend its rules.',
    //   poster: 'https://upload.wikimedia.org/wikipedia/en/c/c1/The_Matrix_Poster.jpg'
    // }
  ];

  get genres(): string[] {
    return ['All', ...Array.from(new Set(this.movies.map(m => m.genre)))];
  }

  filteredMovies(): Movie[] {
    return this.selectedGenre === 'All'
      ? this.movies
      : this.movies.filter(m => m.genre === this.selectedGenre);
  }

  get averageRating(): number {
    return this.movies.reduce((sum, m) => sum + m.rating, 0) / this.movies.length;
  }

  stars(n: number): number[] {
    // helper to loop 1..5 for ratings
    return [1, 2, 3, 4, 5].map(i => i <= n ? 1 : 0);
  }
}
