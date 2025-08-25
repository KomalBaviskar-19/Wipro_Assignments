import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';

interface Song {
  name: string;
  artist: string;
  album: string;
  duration: string;
  rating: number;
  imageUrl: string;
}

@Component({
  selector: 'app-music-list',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatFormFieldModule,
    MatSelectModule
  ],
  templateUrl: './music-list.component.html',
  styleUrls: ['./music-list.component.css']
})
export class MusicListComponent implements OnInit {
  songs: Song[] = [
    {
      name: 'Blinding Lights',
      artist: 'The Weeknd',
      album: 'After Hours',
      duration: '3:20',
      rating: 5,
      imageUrl: 'https://preview.redd.it/jizzq3ra3zb41.jpg?width=1080&crop=smart&auto=webp&s=91c63e005f11f26e1610930caf98f15b21068856'
    },
    {
      name: 'Shape of You',
      artist: 'Ed Sheeran',
      album: '÷ (Divide)',
      duration: '3:53',
      rating: 4,
      imageUrl: 'https://ents24.imgix.net/image/upload/f95f44d8-1651-42d7-9f21-1f12485d7570.jpg?auto=format&crop=faces&w=1920&h=1920'
    },
    {
      name: 'Bohemian Rhapsody',
      artist: 'Queen',
      album: 'A Night at the Opera',
      duration: '5:55',
      rating: 5,
      imageUrl: 'https://backstage.officialcharts.com/sites/default/files/2023-06/Bohemian-Rhapsody%20artwork.jpg'
    },
    {
      name: 'Rolling in the Deep',
      artist: 'Adele',
      album: '21',
      duration: '3:48',
      rating: 4,
      imageUrl: 'https://i1.sndcdn.com/artworks-TT6eL5zEUDHxTuqW-JPqZjQ-t500x500.jpg'
    }
  ];

  filteredSongs: Song[] = [];
  artistFilter: string = '';
  albumFilter: string = '';

  ngOnInit() {
    this.filteredSongs = [...this.songs];
  }

  filterSongs() {
    this.filteredSongs = this.songs.filter(song => {
      const byArtist = !this.artistFilter || song.artist.toLowerCase().includes(this.artistFilter.toLowerCase());
      const byAlbum = !this.albumFilter || song.album.toLowerCase().includes(this.albumFilter.toLowerCase());
      return byArtist && byAlbum;
    });
  }
}