import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Teacher } from './teacher';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {
  private url: string = "http://localhost:8080/rest/teachers"

  constructor(
    private http: HttpClient
  ) { }

  getTeachers(): Observable<Teacher[]> {
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');
    return this.http.get<Teacher[]>(this.url+"/list",{headers: queryHeader});
  }

  deleteTeacher(id: number): Observable<Object>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    let queryParams = new HttpParams();
    queryParams = queryParams.append("id",id); //VERY IMPORTANT
    return this.http.delete(this.url,{headers: queryHeader ,params: queryParams});
  }

  getTeacher(id:number): Observable<Teacher>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    return this.http.get<Teacher>(this.url+ "/"+id, {headers: queryHeader});
  }

  updateTeacher(teacher: Teacher): Observable<object>{
    console.log(teacher)
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    console.log("envoie de la requete")
    return this.http.post(this.url+"/update", teacher);
  }

  newTeacher(nom:string, prenom:string, site:string, mail:string): Observable<Teacher>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    
    let queryParams = new HttpParams();
    queryParams = queryParams.append("nom",nom);
    queryParams = queryParams.append("prenom",prenom);
    queryParams = queryParams.append("site",site);
    queryParams = queryParams.append("mail",mail);
    console.log("new teacher")
    return this.http.post<Teacher>("http://localhost:8080/rest/teachers/new", {hearders: queryHeader,params: queryParams})
  }
}
