package com.example.btpsd.repositories;

import com.example.btpsd.model.ExecutionOrderMain;
import com.example.btpsd.model.ServiceInvoiceMain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ServiceInvoiceMainRepository extends CrudRepository<ServiceInvoiceMain, Long> {


    List<ServiceInvoiceMain> findByLineNumber(String lineNumber);

    Optional<ServiceInvoiceMain> findTopByExecutionOrderMainOrderByServiceInvoiceCodeDesc(ExecutionOrderMain executionOrderMain);

    Optional<ServiceInvoiceMain> findTopByOrderByServiceInvoiceCodeDesc();

    ServiceInvoiceMain findTopByExecutionOrderMainExecutionOrderMainCodeOrderByServiceInvoiceCodeDesc(Long executionOrderMainCode);

}
