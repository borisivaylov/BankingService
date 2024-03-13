package com.tinqin.bankingService.api.base;

public interface OperationProcessor <I extends  OperationInput, P extends OperationResult>{
    P process (I operationInput);
}
