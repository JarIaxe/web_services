import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private url: string = "localhost:8080/rest/student"

  constructor(
    private http: HttpClient
  ) { }

  getStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(this.url)
  }
}
