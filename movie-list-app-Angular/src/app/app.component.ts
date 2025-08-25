import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MovieListComponent } from './movie-list/movie-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, MatToolbarModule, MatIconModule, MovieListComponent],
  template: `
    <mat-toolbar color="primary">
      <mat-icon>movie</mat-icon>&nbsp; MOVIE-LIST
      <span style="flex:1 1 auto;"></span>
      <span class="toolbar-sub">Angular 22 · Material 19</span>
    </mat-toolbar>

    <app-movie-list></app-movie-list>
  `,
  styles: [`
    mat-toolbar { position: sticky; top: 0; z-index: 5; }
    .toolbar-sub { opacity: .85; font-weight: 300; }
  `]
})
export class AppComponent {}
