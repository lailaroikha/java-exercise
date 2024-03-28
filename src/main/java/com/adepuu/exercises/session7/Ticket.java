package com.adepuu.exercises.session7;

public class Ticket extends User{
    class Ticket{
        private int ticketId;
        private String eventName;
        private  double price;
        private boolean isAvailable;

        public Ticket(int ticketId, String eventName, double price) {
            this.ticketId = ticketId;
            this.eventName = eventName;
            this.price = price;
        }
        public int getTicketId(){
            return  this.ticketId;
        }
        public String getEventName(){
            return  this.eventName;
        }
        public double getPrice(){
            return  this.price;
        }
    }
}
