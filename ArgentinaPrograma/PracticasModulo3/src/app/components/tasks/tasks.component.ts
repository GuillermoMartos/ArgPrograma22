import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../service/task.service';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  tasks:Task[]=[];
  constructor(private taskService:TaskService) {
    
   }

  ngOnInit(): void {
    // el this apunta al tasks de línea 11, lo llena con el getter del service
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
  }

  borrarTask(task:Task){
    this.taskService.borrarTaskDB(task).subscribe()
    this.taskService.getTasks().subscribe(response=>
      this.tasks=response)
    return alert(`tarea "${task.text}" fue eliminada`)
  }

  setReminder(task:Task){
    task.reminder=!task.reminder
    this.taskService.cambiarReminderDB(task).subscribe()
  }

  addTaskDB(task:Task){
    return alert(task.id)
  }

}
