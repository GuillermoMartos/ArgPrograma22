import { Injectable } from '@angular/core';
import {HttpClient, HttpHandler} from '@angular/common/http'
import {Task} from '../Task'
// observable es como un suscribe, vuelve al componente asincrónico al estar pendiente de cambios
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private apiUrl="http://localhost:5000/tasks"
  constructor(
    private http:HttpClient
  ) { }

  getTasks():Observable<Task[]>{
    return this.http.get<Task[]>(this.apiUrl)
  }

  borrarTaskDB(task:Task):Observable<Task>{
    const pointer=`${this.apiUrl}/${task.id}`
    return this.http.delete<Task>(pointer)
  }
}
