# WUndergroundAPILib

This serves to provide a very basic binding to a number of weather endpoints provided
by the (https://www.wunderground.com/weather/api/ Weather Underground API Documentation)

## How to use the API
The API exposes a high-level API, as defined by the `WUnderground` interface, allows the client to gain access to the `ConditionsAPI` and `ForecastAPI` which provide the functionality implemented thus far.  The return type for all interface methods is the `APIResponseHandler` interface which defines a basic contract for retrieving API data.


## Code examples
To execute calls against the API, the client will need to instantiate an `WUndergroundTemplate` instance by supplying their own API key, which can be gained here: https://www.wunderground.com/weather/api/d/questionnaire.html?plan=a&level=0&history=undefined, or using a default one.  NOTE: the default API key is rate-limited and only allows up to 10 API calls per minute.  The value objects are exposed in the `com.jdappel.android.wunderground.model.api` package.

### Access Conditions API

```
WUnderground api = new WUndergroundTemplate();
APIResponseHandler<CurrentObservation> response = api.getConditionsAPI().getCurrentObservationByLatLong(40.1222,-82.9978);
```

### Access Forecast API

```
WUnderground api = new WUndergroundTemplate();
APIResponseHandler<Forecast> response = api.getForecastAPI().getForecastByLatLong(40.1222,-82.9978)
```
