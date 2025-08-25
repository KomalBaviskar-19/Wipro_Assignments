import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MusicListComponent } from './music-list/music-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MusicListComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'music-playlist-app';
}