package com.example.android.justjava;

/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int totalPrice = calculatePrice(quantity, 5);
        String priceMessage = createOrderSummary("wang", quantity, totalPrice);
        displayMessage(priceMessage);
    }
    /**
     * This method is called when the +or- button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view) {
        quantity = quantity - 1;
        if(quantity < 0)
            quantity = 0;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    /**
     * This method is calculate price
     * @return total price
     */
    private int calculatePrice(int quantity,int price) {
        return quantity * price;
    }
    /**
     * This method is calculate price
     * @return total price
     */
    private String createOrderSummary(String name,int quantity,int price) {
        String sendMessage ="name: " + name + "\nQuantity: " + quantity +
                "\nTotal: " + price +  "\nThank you";
        return sendMessage;
    }
}