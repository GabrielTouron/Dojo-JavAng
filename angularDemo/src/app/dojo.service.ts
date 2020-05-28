import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dojo } from './dojo.model';

@Injectable({
  providedIn: 'root'
})
export class DojoService {

  constructor(private httpClient: HttpClient) {}

  getAll(): Observable<Dojo[]> {
    return this.httpClient.get<Dojo[]>('http://localhost:8080/dojo');
    }


}
