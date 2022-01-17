import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Output() clickAgregar:EventEmitter<Task[]>=new EventEmitter()
  title : string ="Tasker 2.3"
  constructor() { }

  ngOnInit(): void {
  }

  sumaTareas(){
    // this.clickAgregar.emit({'text':"hacer la tarea",
    // 'day':'3 de Febrero','reminder':true})
    alert("hola")
  }
  
  onClick() {
    // la función debe emitir un evento hacia afuera, por eso output y la variable a la cual vamos a bindear esta función... la vamos a recuperar en las instanciaciones del componente (o sea, donde la llamamos como <app-button/>, o sea en el html del header)
    let body: Task = {
      id: 8,
      text: "eventazo",
      day: "3 de jamás",
      reminder: false,
    };
   
    // this.addClick.emit(body)
  }

}
