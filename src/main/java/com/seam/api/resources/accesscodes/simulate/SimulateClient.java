/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.accesscodes.simulate;

import com.seam.api.core.ApiError;
import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.accesscodes.simulate.requests.SimulateCreateUnmanagedAccessCodeRequest;
import com.seam.api.types.SimulateCreateUnmanagedAccessCodeResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SimulateClient {
    protected final ClientOptions clientOptions;

    public SimulateClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public SimulateCreateUnmanagedAccessCodeResponse createUnmanagedAccessCode(
            SimulateCreateUnmanagedAccessCodeRequest request) {
        return createUnmanagedAccessCode(request, null);
    }

    public SimulateCreateUnmanagedAccessCodeResponse createUnmanagedAccessCode(
            SimulateCreateUnmanagedAccessCodeRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/simulate/create_unmanaged_access_code")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), SimulateCreateUnmanagedAccessCodeResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
