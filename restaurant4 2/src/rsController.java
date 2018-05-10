
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;
public class rsController implements Initializable {


    @FXML
    private Text rName;
    @FXML
    private Text rStyle;
    @FXML
    private Text rPrice;
    @FXML
    private Text rLocation;
    @FXML
    private Text rReviews;


    private Restaurant r1;
    private Restaurant r2;
    private Restaurant r3;
    private Restaurant r4;
    private Restaurant r5;
    private Restaurant r6;
    private Restaurant r7;
    private Restaurant r8;
    private Restaurant r9;
    private Restaurant r10;
    private Restaurant r11;
    private Restaurant r12;
    private Restaurant r13;
    private Restaurant r14;
    private Restaurant r15;
    private Restaurant r16;
    private Restaurant r17;
    private Restaurant r18;
    private Restaurant r19;
    private Restaurant r20;
    private Restaurant r21;
    private Restaurant r22;
    private Restaurant r23;
    private Restaurant r24;
    private Restaurant r25;
    private Restaurant r26;
    private Restaurant r27;
    private Restaurant r28;
    private Restaurant r29;
    private Restaurant r30;
    static int random;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        r1 = new Restaurant("Name: Al Porto Ristorante", "Style: Italian", "Price: $$$$$", "Location: Gastown", "Review: *****");
        r2 = new Restaurant("Name: Shizenya Restaurant", "Style: Japanese", "Price: $$$", "Location: Hornby St", "Review: ***");
        r3 = new Restaurant("Name: Brazil Station", "Style: Brazilian", "Price: $$", "Location: West End", "Review: ***");
        r4 = new Restaurant("Name: Yakinikuya BBQ", "Style: Japanese", "Price: $$$$", "Location: Burrard St", "Review: *****");
        r5 = new Restaurant("Name: Ciao Bella Restaurant", "Style: Italian", "Price: $$$", "Location: Denman St", "Review: ***");
        r6 = new Restaurant("Name: SalaThai", "Style: Thai", "Price: $$$$", "Location: Burrard", "Review: ****");
        r7 = new Restaurant("Name: Fayuca", "Style: Mexican", "Price: $$", "Location: Yaletown", "Review: ****");
        r8 = new Restaurant("Name: Bellaggio Cafe", "Style: Italian", "Price: $$", "Location: Hornby St", "Review: ***");
        r9 = new Restaurant("Name: Ryuu Japanese Kitchen", "Style: Japanese", "Price: $$$", "Location: Seymour St", "Review: ***");
        r10 = new Restaurant("Name: Thida Thai Restaurant", "Style: Thai", "Price: $", "Location: Davie St", "Review: ***");
        r11 = new Restaurant("Name: Gringo", "Style: Mexican", "Price: $", "Location: Gastown", "Review: ****");
        r12 = new Restaurant("Name: Rio", "Style: Brazilian", "Price: $$", "Location: West End", "Review: ***");
        r13 = new Restaurant("Name: Donair Dude", "Style: Mediterranean", "Price: $", "Location: Granville St", "Review: ****");
        r14 = new Restaurant("Name: Bao Bei Chinese Brasserie", "Style: Chinese", "Price: $", "Location:  Chinatown", "Review: ****");
        r15 = new Restaurant("Name: Five Guys", "Style: Burger", "Price: $$", "Location: Robson St", "Review: ***");
        r16 = new Restaurant("Name: Donare Dude ", "Style: Mediterranean", "Price: $", "Location: Granville St", "Review: ****");
        r17 = new Restaurant("Name: Dae Bak Bon Ga ", "Style: Korean", "Price: $$", "Location: West End", "Review: ***");
        r18 = new Restaurant("Name: Salam Bombay", "Style: Indian", "Price: $$", "Location:  Burrard", "Review: ****");
        r19 = new Restaurant("Name: Super Chef Grill  ", "Style: Chinese", "Price: $", "Location:  Yaletown", "Review: ****");
        r20 = new Restaurant("Name: Save on Meat ", "Style: Burger", "Price: $", "Location: Hastings", "Review: ***");
        r21 = new Restaurant("Name: Sura Korean Cusine", "Style: Korean", "Price: $$", "Location:  West End", "Review: ****");
        r22 = new Restaurant("Name: Crave Indian ", "Style: Indian", "Price: $", "Location: Granville St", "Review: ****");
        r23 = new Restaurant("Name: Dae Bak Bon Ga ", "Style: Korean", "Price: $$", "Location: West End", "Review: ***");
        r24 = new Restaurant("Name: Salam Bombay", "Style: Indian", "Price: $$", "Location:  Burrard", "Review: ****");
        r25 = new Restaurant("Name: Nuba ", "Style: Mediterranean", "Price: $$", "Location: Hastings St", "Review: ****");
        r26 = new Restaurant("Name: Chinatown BBQ ", "Style: Chinese", "Price: $$", "Location: Chinatown", "Review: ****");
        r27 = new Restaurant("Name: Carl's JR", "Style: Burger", "Price: $$", "Location:  Howe", "Review: ***");
        r28 = new Restaurant("Name: Damso ", "Style: Korean", "Price: $$", "Location: West End", "Review: ****");
        r29 = new Restaurant("Name: Curry Fusion ", "Style: Indian", "Price: $", "Location: Robson", "Review: ****");
        r30 = new Restaurant("Name: La Mezcaleria", "Style: Mexican", "Price: $$", "Location:  Gastown", "Review: ****");
    }

    @FXML
    public void randombut(ActionEvent e) {
        random = (int) (Math.random() * 30) + 1;
        int sum = random;
        if (sum == 1) {
            rName.setText(r1.getName());
            rStyle.setText(r1.getStyle());
            rPrice.setText(r1.getPrice());
            rLocation.setText(r1.getLocation());
            rReviews.setText(r1.getReviews());
        } else if (sum == 2) {
            rName.setText(r2.getName());
            rStyle.setText(r2.getStyle());
            rPrice.setText(r2.getPrice());
            rLocation.setText(r2.getLocation());
            rReviews.setText(r2.getReviews());
        } else if (sum == 3) {
            rName.setText(r3.getName());
            rStyle.setText(r3.getStyle());
            rPrice.setText(r3.getPrice());
            rLocation.setText(r3.getLocation());
            rReviews.setText(r3.getReviews());
        } else if (sum == 4) {
            rName.setText(r4.getName());
            rStyle.setText(r4.getStyle());
            rPrice.setText(r4.getPrice());
            rLocation.setText(r4.getLocation());
            rReviews.setText(r4.getReviews());
        } else if (sum == 5) {
            rName.setText(r5.getName());
            rStyle.setText(r5.getStyle());
            rPrice.setText(r5.getPrice());
            rLocation.setText(r5.getLocation());
            rReviews.setText(r5.getReviews());
        } else if (sum == 6) {
            rName.setText(r6.getName());
            rStyle.setText(r6.getStyle());
            rPrice.setText(r6.getPrice());
            rLocation.setText(r6.getLocation());
            rReviews.setText(r6.getReviews());
        } else if (sum == 7) {
            rName.setText(r7.getName());
            rStyle.setText(r7.getStyle());
            rPrice.setText(r7.getPrice());
            rLocation.setText(r7.getLocation());
            rReviews.setText(r7.getReviews());
        } else if (sum == 8) {
            rName.setText(r8.getName());
            rStyle.setText(r8.getStyle());
            rPrice.setText(r8.getPrice());
            rLocation.setText(r8.getLocation());
            rReviews.setText(r8.getReviews());
        } else if (sum == 9) {
            rName.setText(r9.getName());
            rStyle.setText(r9.getStyle());
            rPrice.setText(r9.getPrice());
            rLocation.setText(r9.getLocation());
            rReviews.setText(r9.getReviews());
        } else if (sum == 10) {
            rName.setText(r10.getName());
            rStyle.setText(r10.getStyle());
            rPrice.setText(r10.getPrice());
            rLocation.setText(r10.getLocation());
            rReviews.setText(r10.getReviews());
        } else if (sum == 11) {
            rName.setText(r11.getName());
            rStyle.setText(r11.getStyle());
            rPrice.setText(r11.getPrice());
            rLocation.setText(r11.getLocation());
            rReviews.setText(r11.getReviews());
        } else if (sum == 12) {
            rName.setText(r12.getName());
            rStyle.setText(r12.getStyle());
            rPrice.setText(r12.getPrice());
            rLocation.setText(r12.getLocation());
            rReviews.setText(r12.getReviews());
        } else if (sum == 13) {
            rName.setText(r13.getName());
            rStyle.setText(r13.getStyle());
            rPrice.setText(r13.getPrice());
            rLocation.setText(r13.getLocation());
            rReviews.setText(r13.getReviews());
        } else if (sum == 14) {
            rName.setText(r14.getName());
            rStyle.setText(r14.getStyle());
            rPrice.setText(r14.getPrice());
            rLocation.setText(r14.getLocation());
            rReviews.setText(r14.getReviews());
        } else if (sum == 15) {
            rName.setText(r15.getName());
            rStyle.setText(r15.getStyle());
            rPrice.setText(r15.getPrice());
            rLocation.setText(r15.getLocation());
            rReviews.setText(r15.getReviews());
        } else if (sum == 16) {
            rName.setText(r16.getName());
            rStyle.setText(r16.getStyle());
            rPrice.setText(r16.getPrice());
            rLocation.setText(r16.getLocation());
            rReviews.setText(r16.getReviews());
        } else if (sum == 17) {
            rName.setText(r17.getName());
            rStyle.setText(r17.getStyle());
            rPrice.setText(r17.getPrice());
            rLocation.setText(r17.getLocation());
            rReviews.setText(r17.getReviews());
        } else if (sum == 18) {
            rName.setText(r18.getName());
            rStyle.setText(r18.getStyle());
            rPrice.setText(r18.getPrice());
            rLocation.setText(r18.getLocation());
            rReviews.setText(r18.getReviews());
        } else if (sum == 19) {
            rName.setText(r19.getName());
            rStyle.setText(r19.getStyle());
            rPrice.setText(r19.getPrice());
            rLocation.setText(r19.getLocation());
            rReviews.setText(r19.getReviews());
        } else if (sum == 20) {
            rName.setText(r20.getName());
            rStyle.setText(r20.getStyle());
            rPrice.setText(r20.getPrice());
            rLocation.setText(r20.getLocation());
            rReviews.setText(r20.getReviews());
        } else if (sum == 21) {
            rName.setText(r21.getName());
            rStyle.setText(r21.getStyle());
            rPrice.setText(r21.getPrice());
            rLocation.setText(r21.getLocation());
            rReviews.setText(r21.getReviews());
        } else if (sum == 22) {
            rName.setText(r22.getName());
            rStyle.setText(r22.getStyle());
            rPrice.setText(r22.getPrice());
            rLocation.setText(r22.getLocation());
            rReviews.setText(r22.getReviews());
        } else if (sum == 23) {
            rName.setText(r23.getName());
            rStyle.setText(r23.getStyle());
            rPrice.setText(r23.getPrice());
            rLocation.setText(r23.getLocation());
            rReviews.setText(r23.getReviews());
        } else if (sum == 24) {
            rName.setText(r24.getName());
            rStyle.setText(r24.getStyle());
            rPrice.setText(r24.getPrice());
            rLocation.setText(r24.getLocation());
            rReviews.setText(r24.getReviews());
        } else if (sum == 25) {
            rName.setText(r25.getName());
            rStyle.setText(r25.getStyle());
            rPrice.setText(r25.getPrice());
            rLocation.setText(r25.getLocation());
            rReviews.setText(r25.getReviews());
        } else if (sum == 26) {
            rName.setText(r26.getName());
            rStyle.setText(r26.getStyle());
            rPrice.setText(r26.getPrice());
            rLocation.setText(r26.getLocation());
            rReviews.setText(r26.getReviews());
        } else if (sum == 27) {
            rName.setText(r27.getName());
            rStyle.setText(r27.getStyle());
            rPrice.setText(r27.getPrice());
            rLocation.setText(r27.getLocation());
            rReviews.setText(r27.getReviews());
        } else if (sum == 28) {
            rName.setText(r28.getName());
            rStyle.setText(r28.getStyle());
            rPrice.setText(r28.getPrice());
            rLocation.setText(r28.getLocation());
            rReviews.setText(r28.getReviews());
        } else if (sum == 29) {
            rName.setText(r29.getName());
            rStyle.setText(r29.getStyle());
            rPrice.setText(r29.getPrice());
            rLocation.setText(r29.getLocation());
            rReviews.setText(r29.getReviews());
        } else if (sum == 30) {
            rName.setText(r30.getName());
            rStyle.setText(r30.getStyle());
            rPrice.setText(r30.getPrice());
            rLocation.setText(r30.getLocation());
            rReviews.setText(r30.getReviews());
        }
    }
}