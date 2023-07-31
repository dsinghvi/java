package com.seam.api.resources.noisesensors;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.noisesensors.noisethresholds.NoiseThresholdsClient;
import com.seam.api.resources.noisesensors.simulate.SimulateClient;
import java.util.function.Supplier;

public class NoiseSensorsClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<SimulateClient> simulateClient;

    protected final Supplier<NoiseThresholdsClient> noiseThresholdsClient;

    public NoiseSensorsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.simulateClient = Suppliers.memoize(() -> new SimulateClient(clientOptions));
        this.noiseThresholdsClient = Suppliers.memoize(() -> new NoiseThresholdsClient(clientOptions));
    }

    public SimulateClient simulate() {
        return this.simulateClient.get();
    }

    public NoiseThresholdsClient noiseThresholds() {
        return this.noiseThresholdsClient.get();
    }
}
