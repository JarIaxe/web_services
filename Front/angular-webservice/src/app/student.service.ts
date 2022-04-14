import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private url: string = "http://192.168.151.196:8080/rest/student"

  constructor(
    private http: HttpClient
  ) { }

  getStudents(): Observable<Student[]> {
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');
    return this.http.get<Student[]>(this.url,{headers: queryHeader});
  }

  deleteUser(id: number): Observable<Object>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");


    // 'Access-Control-Allow-Headers': 'Content-Type',
    //  'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT',

    let queryParams = new HttpParams();
    queryParams = queryParams.append("id",1); //VERY IMPORTANT
    return this.http.delete(this.url,{headers: queryHeader ,params: queryParams});
  }
}
