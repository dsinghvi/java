package com.seam.api.thermostats;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsCreateRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsDeleteRequest;
import com.seam.api.resources.thermostats.requests.ThermostatsGetRequest;
import com.seam.api.resources.thermostats.requests.ThermostatsUpdateRequest;
import com.seam.api.types.Device;
import com.seam.api.types.DeviceType;
import com.seam.api.types.NoiseThreshold;
import com.seam.api.types.ThermostatsUpdateRequestDefaultClimateSetting;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ThermostatsTest {

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
    }

    @Test
    public void test_thermostats() {
        List<Device> thermostats = seam.thermostats().list();
        Assertions.assertThat(thermostats).hasSize(3);

        Device thermostat = thermostats.get(0);
        Assertions.assertThat(thermostat.getDeviceType()).isEqualTo(DeviceType.ECOBEE_THERMOSTAT);

        thermostat = seam.thermostats().get(ThermostatsGetRequest.builder()
                .deviceId(thermostat.getDeviceId())
                .build());
        Assertions.assertThat(thermostat.getDeviceType()).isEqualTo(DeviceType.ECOBEE_THERMOSTAT);

        seam.thermostats().update(ThermostatsUpdateRequest.builder()
                .deviceId(thermostat.getDeviceId())
                .defaultClimateSetting(ThermostatsUpdateRequestDefaultClimateSetting.builder()
                        .hvacModeSetting()
                        .coolingSetPointCelsius(20)
                        .manualOverrideAllowed(true)
                        .build())
                .build());
    }
}
