import java.text.NumberFormat;
import java.util.Locale;

public abstract class Abstraksi {
    public static String formatHarga(double harga) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return format.format(harga);
    }
}

