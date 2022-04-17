import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-modify-user',
  templateUrl: './modify-user.component.html',
  styleUrls: ['./modify-user.component.css']
})
export class ModifyUserComponent implements OnInit {
  stud!: Student;
  constructor(
    private route : ActivatedRoute,
    private studentService : StudentService,
  ) { }

  ngOnInit(): void {
    this.getStudent();
    console.log(this.stud);
  }

  getStudent(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.studentService.getStudent(id).subscribe(student => {this.stud = student, console.log(this.stud) })
  }

  updateStudent(stud: Student): void{
    this.studentService.updateStudent(stud).subscribe(e => console.log("post requete"));
  }
}
