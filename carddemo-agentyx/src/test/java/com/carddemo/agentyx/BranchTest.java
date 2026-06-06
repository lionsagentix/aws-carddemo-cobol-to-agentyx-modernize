// [agentyx-provenance v1] {"dsl_version":"1.0","emitter":"shared.testing.test_emitters.junit5","flavor":"test_emitter_junit5","ir_hash":"unknown"}
package com.carddemo.agentyx;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.carddemo.CardDemoApplication;
import com.carddemo.domain.Account;
import com.carddemo.domain.Card;
import com.carddemo.repo.AccountRepository;
import com.carddemo.repo.CardRepository;
import com.carddemo.service.AccountUpdateService;
import com.carddemo.service.AccountViewService;
import com.carddemo.service.BillPayService;
import com.carddemo.service.CardUpdateService;
import com.carddemo.service.PostingService;

/**
 * Branch tests — generated from scenarios_branch.json by
 * the java_branch_extracted strategy. Each @Test exercises
 * a single AST-derived branch: a state-machine transition,
 * a not-found path, or a wrong-tenant guard.
 *
 * Mockito @MockBean shims repositories so we can drive
 * scenarios deterministically without a database.
 */
@SpringBootTest(classes = CardDemoApplication.class)
class BranchTest {

    @Autowired
    private AccountUpdateService accountUpdateService;

    @Autowired
    private AccountViewService accountViewService;

    @Autowired
    private BillPayService billPayService;

    @Autowired
    private CardUpdateService cardUpdateService;

    @Autowired
    private PostingService postingService;

    @MockBean
    private AccountRepository accountRepository;

    @MockBean
    private CardRepository cardRepository;

    @Test
    void branch_AccountUpdateService_update_l28_not_found() throws Exception {
        // not_found AccountUpdateService.update — repo lookup returns empty Optional
        when(accountRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class,
            () -> accountUpdateService.update(1L, null));
    }

    @Test
    void branch_AccountViewService_view_l13_not_found() throws Exception {
        // not_found AccountViewService.view — repo lookup returns empty Optional
        when(accountRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class,
            () -> accountViewService.view(1L));
    }

    @Test
    void branch_BillPayService_pay_l17_not_found() throws Exception {
        // not_found BillPayService.pay — repo lookup returns empty Optional
        when(accountRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class,
            () -> billPayService.pay(1L));
    }

    @Test
    void branch_CardUpdateService_update_l12_not_found() throws Exception {
        // not_found CardUpdateService.update — repo lookup returns empty Optional
        when(cardRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class,
            () -> cardUpdateService.update("T1", null));
    }

    @Test
    void branch_PostingService_post_l16_not_found() throws Exception {
        // not_found PostingService.post — repo lookup returns empty Optional
        when(accountRepository.findById(any())).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class,
            () -> postingService.post(1L, "T1", 1L, java.math.BigDecimal.ONE));
    }
}
