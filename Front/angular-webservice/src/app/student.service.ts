import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private url: string = "http://localhost:8080/rest/students"

  constructor(
    private http: HttpClient
  ) { }

  getStudents(): Observable<Student[]> {
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');
    return this.http.get<Student[]>(this.url+"/list",{headers: queryHeader});
  }

  deleteUser(id: number): Observable<Object>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    let queryParams = new HttpParams();
    queryParams = queryParams.append("idStudent",id); //VERY IMPORTANT
    return this.http.delete(this.url,{headers: queryHeader ,params: queryParams});
  }

  getStudent(id:number): Observable<Student>{
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    let queryParams = new HttpParams();
    return this.http.get<Student>(this.url+ "/"+id, {headers: queryHeader});
  }

  updateStudent(stud: Student): Observable<object>{
    console.log(stud)
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    
    let queryParams = new HttpParams();
    queryParams = queryParams.append("id",stud.id);
    queryParams = queryParams.append("nom",stud.nom);
    queryParams = queryParams.append("prenom",stud.prenom);
    queryParams = queryParams.append("cursus",stud.cursus.toString());
    queryParams = queryParams.append("site",stud.site.toString());
    queryParams = queryParams.append("mail",stud.mail);
    console.log("envoie de la requete")
    return this.http.post(this.url+"/update", stud);
  }

  newStudent(nom:string, prenom: string, cursus: string, site: string, mail:string): void {
    let queryHeader = new HttpHeaders();
    queryHeader = queryHeader.append("Access-Control-Allow-Origin","*");
    queryHeader = queryHeader.append('Access-Control-Allow-Headers','Content-Type');
    queryHeader = queryHeader.append('Access-Control-Allow-Methods','GET,POST,OPTIONS,DELETE,PUT');

    
    let queryParams = new HttpParams();
    queryParams = queryParams.append("nom",nom);
    queryParams = queryParams.append("prenom",prenom);
    queryParams = queryParams.append("cursus",cursus.toString());
    queryParams = queryParams.append("site",site.toString());
    queryParams = queryParams.append("mail",mail);
    this.http.post(this.url, {params: queryParams})
  }
}
