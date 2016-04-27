/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation.api;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionInMethods.
 */
public final class SubscriptionInMethodsInner {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionInMethodsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SubscriptionInMethodsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionInMethodsInner(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(SubscriptionInMethodsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionInMethods to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionInMethodsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/subscriptionId/method/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postMethodLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/subscriptionId/method/string/none/path/local/null/{subscriptionId}")
        Call<ResponseBody> postMethodLocalNull(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/subscriptionId/path/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postPathLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/subscriptionId/swagger/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        Call<ResponseBody> postSwaggerLocalValid(@Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMethodLocalValid(String subscriptionId) throws ErrorException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postMethodLocalValid(subscriptionId, this.client.getAcceptLanguage());
        return postMethodLocalValidDelegate(call.execute());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postMethodLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postMethodLocalValid(subscriptionId, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postMethodLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postMethodLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postMethodLocalNull(String subscriptionId) throws ErrorException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postMethodLocalNull(subscriptionId, this.client.getAcceptLanguage());
        return postMethodLocalNullDelegate(call.execute());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postMethodLocalNullAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postMethodLocalNull(subscriptionId, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postMethodLocalNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postMethodLocalNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postPathLocalValid(String subscriptionId) throws ErrorException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postPathLocalValid(subscriptionId, this.client.getAcceptLanguage());
        return postPathLocalValidDelegate(call.execute());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postPathLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postPathLocalValid(subscriptionId, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postPathLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postPathLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> postSwaggerLocalValid(String subscriptionId) throws ErrorException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postSwaggerLocalValid(subscriptionId, this.client.getAcceptLanguage());
        return postSwaggerLocalValidDelegate(call.execute());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postSwaggerLocalValidAsync(String subscriptionId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postSwaggerLocalValid(subscriptionId, this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postSwaggerLocalValidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> postSwaggerLocalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}