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
 * Property tests — boundary + invariant + fuzz scenarios.
 *
 * Generated from scenarios_property.json. Asserts the target
 * remains stable under adversarial / boundary input.
 */
@SpringBootTest(classes = CardDemoApplication.class)
@AutoConfigureMockMvc
class PropertyTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void prop_prop_fuzz_08e5aff3() throws Exception {
        // family=fuzz property=no_crash_fuzz_1
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_1128d5f6() throws Exception {
        // family=fuzz property=no_crash_fuzz_8
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_59e61a76() throws Exception {
        // family=fuzz property=no_crash_fuzz_4
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_72525e8d() throws Exception {
        // family=fuzz property=no_crash_fuzz_6
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_8cab8564() throws Exception {
        // family=fuzz property=no_crash_fuzz_9
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_a3d2308c() throws Exception {
        // family=fuzz property=no_crash_fuzz_5
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_b16d7ce2() throws Exception {
        // family=fuzz property=no_crash_fuzz_2
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_b52b8f20() throws Exception {
        // family=fuzz property=no_crash_fuzz_3
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_dcfae1c2() throws Exception {
        // family=fuzz property=no_crash_fuzz_0
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_fuzz_e7e9d411() throws Exception {
        // family=fuzz property=no_crash_fuzz_7
        int s = mockMvc.perform(MockMvcRequestBuilders.post("/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "fuzz input caused 5xx: " + s);
    }

    @Test
    void prop_prop_inv_005c6c52() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_0bcf4fe2() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_0cfe7d11() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_0dc78265() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/billpay/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/billpay/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_0e3885b9() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/view"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/view"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_0fc916f2() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_116d3138() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/transactions/add"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/transactions/add"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_1ddb93b1() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_1ec66a2f() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/transactions/add"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_22c1145d() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_27610c7c() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_29ffdb29() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_2ae73a10() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_2cae659c() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_2ee5e460() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_305f1b15() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_307da5f2() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_31ea9c5a() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_322cdd90() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_338aedfd() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_35195f0a() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_37410569() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_3ce205a1() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_3d0a8e47() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/transactions"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/transactions"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_4268df6b() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_426c85fd() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_434a89db() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_43ab9364() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_4f5b0b6a() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_515b87b4() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/view"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_56f14373() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_5a18d275() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_5c307079() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_61c98cd8() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/update"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/update"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_6215b965() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_66e6787f() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_681b6370() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_6976e00f() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_6cb71e8a() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_6db73bdb() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_6e81cd5d() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_704beccc() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_71b0da77() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/billpay/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_7617ed47() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_76e933b4() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_77cae36b() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/cards"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/cards"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_785e088e() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_78e3a95e() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_7abf990a() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_7dc6521a() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_7fbb85ff() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_82427189() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/transactions"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_85b0a3a5() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/update"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/update"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_89e32b8b() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_93fef533() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_94ee8ab5() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/card-xrefs/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_955ba779() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/update"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_9fe521c1() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/auth/signon"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/auth/signon"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_a2bbe0fb() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/cards"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_a4ef519c() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_a88f6a61() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_aaae994c() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_aebcc3fd() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/auth/signon"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_b15e81d3() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_b549be31() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_b6a5e3c0() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_b9422f93() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/cards"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_ba11f5e8() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/view"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_bc26e202() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_bfab3f2f() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_c1c32c68() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/dis-groups/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_d0321d33() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_d3497883() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/update"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_e0560207() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/trans/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_e0905bd3() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/security-users/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_e1b23185() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_e39d7335() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/cards/1/transactions"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_e44b16fb() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_e95a48c3() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_eb417753() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_f2c3cfb8() throws Exception {
        // family=invariant property=safe_get
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/customers/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_f3b36259() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }

    @Test
    void prop_prop_inv_f77776ef() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_fabf7171() throws Exception {
        // family=invariant property=idempotency
        int s1 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        int s2 = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-types/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s1 == s2,
            "idempotency violated: " + s1 + " vs " + s2);
        assertTrue(s1 < 500,
            "5xx on idempotency probe: " + s1);
    }

    @Test
    void prop_prop_inv_fc64948b() throws Exception {
        // family=invariant property=replay_stability
        int s = mockMvc.perform(MockMvcRequestBuilders.get("/api/tran-cat-bals/1"))
            .andReturn().getResponse().getStatus();
        assertTrue(s < 500,
            "invariant probe returned 5xx: " + s);
    }
}
