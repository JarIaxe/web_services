import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from "@angular/common/http"

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListUserComponent } from './list-user/list-user.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ModifyUserComponent } from './modify-user/modify-user.component';
import { ListTeacherComponent } from './list-teacher/list-teacher.component';
import { ModifyTeacherComponent } from './modify-teacher/modify-teacher.component';
import { NewStudentComponent } from './new-student/new-student.component';
import { NewTeacherComponent } from './new-teacher/new-teacher.component';

@NgModule({
  declarations: [
    AppComponent,
    ListUserComponent,
    ConnexionComponent,
    NavbarComponent,
    ModifyUserComponent,
    ListTeacherComponent,
    ModifyTeacherComponent,
    NewStudentComponent,
    NewTeacherComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
      { path : '', component: AppComponent},
      { path : "users", component: ListUserComponent},
      { path : "users/modify", component: ListUserComponent}
    ]),
    NgbModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
