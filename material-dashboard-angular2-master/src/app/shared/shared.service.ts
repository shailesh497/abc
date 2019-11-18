import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { GuarantorDetails } from 'app/model/GuarantorDetails';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  constructor(private http:HttpClient) { }
  mockurl:string='http://localhost:8083';

  saveData(data:GuarantorDetails)
  {
    console.log(data);
    
    return this.http.post(this.mockurl+'/'+'save',data);
  }
  view(data:GuarantorDetails)
  {
    
  }
  


}
