# TdaAPI
An easy to use Java REST API wrapper for TDAmeritrade OAuth2.0 API v1  
Using OKHTTP 3 and Jackson for http calls/serialization  

## Installing 
`mvn clean install`  
Add TdaAPI-jar-with-dependencies to your classpath  

## Initialize the Api
Create a .properties file containing your TDA api creds  
Expected:  
* `tda.http.path=https\://api.tdameritrade.com/v1/`
* `tda.token.access= TDA ACCESS TOKEN`
* `tda.client_id= TDA CLIENT ID`
* `tda.token.refresh= TDA REFRESH TOKEN`

Once you have populated the relevant fields, each construction of an `ApiSession` will  
Refresh your Access and Refresh tokens and save them to the existing file.  

## Examples
```java
ApiSession tda = Tda.initializeTdaApi(path); //Load tda-api.properties from String path  
SecuritiesAccount account = Tda.getTdaCashAccount(tda,"496140950"); //Fetch account data  
List<Mover> movers = Tda.getTdaMovers(tda, Index.SPXX); //get movers from SPXX   
SymbolFundamental symbol = Tda.getTdaInstrumentFundamental(tda, "T"); //Get fundamental data for symbol  

PriceHistory history = Tda.getTdaSymbolHistory(tda, "T",PeriodType.DAY,Period.TEN,FrequencyType.MINUTE,Period.FIVE,true);  
RSI2Strategy.run(history);
```
