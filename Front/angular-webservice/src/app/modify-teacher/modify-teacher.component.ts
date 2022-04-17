import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Teacher } from '../teacher';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-modify-teacher',
  templateUrl: './modify-teacher.component.html',
  styleUrls: ['./modify-teacher.component.css']
})
export class ModifyTeacherComponent implements OnInit {
  teacher!:Teacher
  constructor(
    private route : ActivatedRoute,
    private teacherService : TeacherService
    ) { }

  ngOnInit(): void {
    this.getTeacher()
  }

  getTeacher(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.teacherService.getTeacher(id).subscribe(student => {this.teacher = student, console.log(this.teacher) })
  }

  updateTeacher(stud: Teacher): void{
    this.teacherService.updateTeacher(stud).subscribe(e => console.log("post requete"));
  }
}
