package com.ptech.ecommerce.service;

import com.ptech.ecommerce.dto.PaymentInfo;
import com.ptech.ecommerce.dto.Purchase;
import com.ptech.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
