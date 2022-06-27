import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  private purchaseUrl = 'http://localhost:7100/rainforest/order/checkout'; 


  constructor(private httpClient: HttpClient) { }

  onSubmit(order: {plant_name: string, quantity: number, total: number}){
    this.httpClient.post<any>(this.purchaseUrl, order);

  }
}