package Oops.Interface;

public class TEST1 {

    abstract static class Booking {
        double amount;
        String bookingId;

        Booking(double amount, String bookingId) {
            this.amount = amount;
            this.bookingId = bookingId;
        }

        void generateTicket() {
            System.out.println("Ticket generated: " + bookingId + " for amount " + amount);
        }

        abstract void processBooking();
    }


    interface Refundable {
        void refund(double amount);
    }

    interface Timing {
        void schedule(String time);
    }


    static class CabBooking extends Booking implements Refundable, Timing {
        CabBooking(double amount, String bookingId) {
            super(amount, bookingId);
        }

        @Override
        void processBooking() {
            System.out.println("Cab booking confirmed for " + bookingId + " of amount " + amount);
        }

        @Override
        public void refund(double refundAmount) {
            System.out.println("Cab " + bookingId + " refunded. Refund: " + refundAmount);
        }

        @Override
        public void schedule(String time) {
            System.out.println("Cab " + bookingId + " scheduled at " + time);
        }
    }


    static class TrainBooking extends Booking implements Refundable {
        TrainBooking(double amount, String bookingId) {
            super(amount, bookingId);
        }

        @Override
        void processBooking() {
            System.out.println("Train ticket " + bookingId + " confirmed for amount " + amount);
        }

        @Override
        public void refund(double refundAmount) {
            System.out.println("Train ticket " + bookingId + " refunded. Refund: " + refundAmount);
        }
    }


    static class BusBooking extends Booking {
        BusBooking(double amount, String bookingId) {
            super(amount, bookingId);
        }

        @Override
        void processBooking() {
            System.out.println("Bus ticket " + bookingId + " confirmed for amount " + amount);
        }
    }


    public static void main(String[] args) {
        try {

            CabBooking cab = new CabBooking(500, "CAB101");
            cab.processBooking();
            cab.generateTicket();
            cab.schedule("10:00 AM");
            cab.refund(300);

            System.out.println();


            TrainBooking train = new TrainBooking(1200, "TRN202");
            train.processBooking();
            train.generateTicket();
            train.refund(1000);

            System.out.println();


            BusBooking bus = new BusBooking(200, "BUS303");
            bus.processBooking();
            bus.generateTicket();

            System.out.println();


            Refundable refundRef = (Refundable) bus;
            refundRef.refund(100);

        } catch (ClassCastException e) {
            System.out.println("Error: This booking type does not support refund.");
        }
    }
}