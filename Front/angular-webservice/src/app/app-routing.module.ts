import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { ListTeacherComponent } from './list-teacher/list-teacher.component';
import { ListUserComponent } from './list-user/list-user.component';
import { ModifyTeacherComponent } from './modify-teacher/modify-teacher.component';
import { ModifyUserComponent } from './modify-user/modify-user.component';
import { NewStudentComponent } from './new-student/new-student.component';
import { NewTeacherComponent } from './new-teacher/new-teacher.component';

const routes: Routes = [
  { path: "connexion", component: ConnexionComponent},
  { path: "home", component: AppComponent},
  { path: '', redirectTo: 'connexion', pathMatch: 'full'},
  { path: "users", component: ListUserComponent},
  { path: "users/modify/:id", component: ModifyUserComponent},
  { path: "users/new", component: NewStudentComponent},
  { path: "teachers", component: ListTeacherComponent},
  { path: "teachers/modify/:id", component: ModifyTeacherComponent},
  { path: "teachers/new", component: NewTeacherComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
