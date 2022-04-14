import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private url: string = "192.168.151.196:8080/rest/student"

  constructor(
    private http: HttpClient
  ) { }

  getStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(this.url)
  }

  deleteUser(id: number): Observable<Object>{
    let queryParams = new HttpParams();
    queryParams = queryParams.append("id",1); //VERY IMPORTANT
    return this.http.delete(this.url,{params: queryParams});
  }
}
