import javax.swing.*;

public class Hotel {
    private JButton createGuestButton;
    private JButton createRoomButton;
    private JButton reservationButton;
    private JButton paymentButton;
    private JLabel title;

    public JButton getCreateGuestButton() {
        return createGuestButton;
    }

    public void setCreateGuestButton(JButton createGuestButton) {
        this.createGuestButton = createGuestButton;
    }

    public JButton getCreateRoomButton() {
        return createRoomButton;
    }

    public void setCreateRoomButton(JButton createRoomButton) {
        this.createRoomButton = createRoomButton;
    }

    public JButton getReservationButton() {
        return reservationButton;
    }

    public void setReservationButton(JButton reservationButton) {
        this.reservationButton = reservationButton;
    }

    public JButton getPaymentButton() {
        return paymentButton;
    }

    public void setPaymentButton(JButton paymentButton) {
        this.paymentButton = paymentButton;
    }

    public JLabel getTitle() {
        return title;
    }

    public void setTitle(JLabel title) {
        this.title = title;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
