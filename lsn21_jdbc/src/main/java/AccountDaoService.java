import java.util.List;

public interface AccountDaoService {
    Account getAccountByUserId();
    List<Account> getAccountsByNumber(String number);
}
