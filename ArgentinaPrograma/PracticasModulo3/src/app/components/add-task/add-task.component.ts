import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {
  @Output() newTaskClic:EventEmitter<Task>=new EventEmitter()
  text:string=""
  id:number=0
  date:string=""
  reminder:boolean=true
  constructor() { }

  ngOnInit(): void {
  }

  addDB(){
    let task: Task = {
      id:this.id,
      text:this.text,
      day:this.date,
      reminder:this.reminder,
    };
    
    this.newTaskClic.emit(task)
  }
}
