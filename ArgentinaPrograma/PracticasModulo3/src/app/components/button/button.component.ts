import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css'],
})
export class ButtonComponent implements OnInit {
  @Input() text: string = '';
  @Input() color: string = '';
  // @Output() addClick = new EventEmitter();
  @Output() addClick:EventEmitter<Task>=new EventEmitter()
  constructor() {}


  ngOnInit(): void {}

  onClick() {
    // la función debe emitir un evento hacia afuera, por eso output y la variable a la cual vamos a bindear esta función... la vamos a recuperar en las instanciaciones del componente (o sea, donde la llamamos como <app-button/>, o sea en el html del header)
    
    // this.addClick.emit(body)
  }
}
