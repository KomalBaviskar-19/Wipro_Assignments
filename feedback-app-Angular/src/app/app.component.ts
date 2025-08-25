import { Component } from '@angular/core';
import { FeedbackFormComponent } from './feedback-form/feedback-form.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FeedbackFormComponent],
  template: `
    <h1 style="text-align:center; color:#3f51b5; margin:20px;">
      Feedback Application
    </h1>
    <app-feedback-form></app-feedback-form>
  `
})
export class AppComponent {}
