import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],   // ✅ FIX
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Calculator App';
  num1: number = 0;
  num2: number = 0;
  result: string = '';

  add() {
    this.result = `Addition: ${this.num1 + this.num2}`;
  }

  subtract() {
    this.result = `Subtraction: ${this.num1 - this.num2}`;
  }

  multiply() {
    this.result = `Multiplication: ${this.num1 * this.num2}`;
  }

  divide() {
    if (this.num2 === 0) {
      this.result = 'Division by zero not allowed!';
    } else {
      this.result = `Division: ${this.num1 / this.num2}`;
    }
  }

  modulus() {
    if (this.num2 === 0) {
      this.result = 'Modulus by zero not allowed!';
    } else {
      this.result = `Modulus: ${this.num1 % this.num2}`;
    }
  }
}
