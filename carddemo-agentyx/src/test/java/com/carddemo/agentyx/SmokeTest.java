// [agentyx-provenance v1] {"dsl_version":"1.0","emitter":"shared.testing.test_emitters.junit5","flavor":"test_emitter_junit5","ir_hash":"unknown"}
package com.carddemo.agentyx;

import com.carddemo.CardDemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Smoke tests — boot the app + probe expected entry points.
 *
 * Generated from smoke/*_smoke.json. The cheapest reliable
 * 'does-it-run?' signal.
 */
@SpringBootTest(classes = CardDemoApplication.class)
@AutoConfigureMockMvc
class SmokeTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void smoke_smoke_boot() throws Exception {
        // process_starts checks are validated by
        // SpringBootTest bootstrapping. If this
        // method ran at all, the context loaded.
        assertNotNull(mockMvc, "Spring context failed to load");
    }

    @Test
    void smoke_smoke_root() throws Exception {
        // smoke smoke_root
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        java.util.Set<Integer> ok = java.util.Set.of(200, 302);
        assertTrue(ok.contains(s),
            "smoke status unexpected (want " + ok + "): " + s);
    }

    @Test
    void smoke_smoke_health() throws Exception {
        // smoke smoke_health
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/actuator/health"))
            .andReturn().getResponse().getStatus();
        java.util.Set<Integer> ok = java.util.Set.of(200, 302, 401);
        assertTrue(ok.contains(s),
            "smoke status unexpected (want " + ok + "): " + s);
    }
}
