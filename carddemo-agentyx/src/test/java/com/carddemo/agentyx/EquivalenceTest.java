// [agentyx-provenance v1] {"dsl_version":"1.0","emitter":"shared.testing.test_emitters.junit5","flavor":"test_emitter_junit5","ir_hash":"unknown"}
package com.carddemo.agentyx;

import com.carddemo.CardDemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Equivalence tests — generated from scenarios_equiv.json.
 *
 * Asserts the target accepts every scenario input shape and
 * returns a non-5xx response.  Source behaviour vs target
 * semantic-diff is a P8.33.x ship (DSL interpreter).
 */
@SpringBootTest(classes = CardDemoApplication.class)
@AutoConfigureMockMvc
class EquivalenceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void eq_052dd85a() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/dis-groups/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_0d470a7f() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/cards/{cardNum}/update", "test")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_1113bbb4() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/customers/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_131e7b55() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/card-xrefs/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_133f239b() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_19cc1f41() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/accounts/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_2855f0d2() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_2ed42d4b() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/cards/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_49714478() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_4b7efe87() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/{acctId}/view", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_53ba71d0() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/security-users/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_5406ca95() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/customers/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_64471044() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/tran-cat-bals/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_68b0f5ac() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/tran-cat-bals/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_7246f6aa() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_78811158() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/trans/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_78d7ef75() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/security-users/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_795183e5() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/signon")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_7c49ae2c() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/accounts/{acctId}/update", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_7c7c4584() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_88535df8() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_8dea8574() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/{cardNum}/transactions", "test"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_933d3682() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.post("/api/billpay/{acctId}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_97e47f3e() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_b2101f8d() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/dis-groups/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_b6fdb897() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_b8b4c2a5() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_c50d1552() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/trans/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_c77a145b() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/tran-types/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_cea7613a() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/cards/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_d3227902() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.post("/api/transactions/add")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_d6b64cdc() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/card-xrefs/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_e3ebe883() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_ec6a2a9f() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.put("/api/tran-types/{id}", 1L)
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_f3ea3ff2() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.delete("/api/accounts/{id}", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }

    @Test
    void eq_fc6bca11() throws Exception {
        // scenario endpoint_sweep (program=)
        int status = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/{acctId}/cards", 1L))
            .andReturn().getResponse().getStatus();
        assertTrue(status < 500,
            "target returned 5xx: " + status);
    }
}
