import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Transaction {
    private Date fechaTransaccion = new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private String dateAsString = sdf.format(fechaTransaccion);
    private String typeTransaction = "";
    private float amount = 0.0f;
    private String description = "";

    public String viewTransactionDetails() {
        return dateAsString + " - " + typeTransaction + " - $" + amount + " - " + description;
    }

    public Transaction() throws ParseException {
    }

    public Transaction(String typeTransaction, float amount, String description) {
        this.typeTransaction = typeTransaction;
        this.amount = amount;
        this.description = description;
    }

    public String getDateAsString() {
        return dateAsString;
    }

    public void setDateAsString(String dateAsString) {
        this.dateAsString = dateAsString;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}