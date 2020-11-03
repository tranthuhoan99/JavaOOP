package ru.mirea.Lab16;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem menuItem);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
