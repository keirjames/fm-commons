package finance.modelling.fmcommons.data.schema.model;

import lombok.Data;

import java.util.List;

@Data
public class Ticker {
    private String symbol;
    private String name;
    private String exchangeCode;
    private String country;
    private String currency;
    private String type;
    private List<FinanceApi> financeApis;
}
