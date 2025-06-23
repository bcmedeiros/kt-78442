# Repro for KT-78442

## Run

```shell
gradle run
```

Expected error:
```
Exception in thread "main" kotlin.reflect.jvm.internal.KotlinReflectionInternalError: Inconsistent number of parameters in the descriptor and Java reflection object: 4 != 3
Calling: context(dev.bcmedeiros.kt78442.KpIntegration) public final fun methodWithContextParameterAndValueClass(calendarDate: java.time.LocalDate, orgId: dev.bcmedeiros.kt78442.Org.Id): kotlin.Unit defined in dev.bcmedeiros.kt78442.KpSync[DeserializedSimpleFunctionDescriptor@1ebea008]
Parameter types: [class dev.bcmedeiros.kt78442.KpSync, class dev.bcmedeiros.kt78442.KpIntegration, class java.time.LocalDate, class java.util.UUID])
Default: false
	at kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.checkParametersSize(ValueClassAwareCaller.kt:273)
	at kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.access$checkParametersSize(ValueClassAwareCaller.kt:1)
	at kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.<init>(ValueClassAwareCaller.kt:126)
	at kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded(ValueClassAwareCaller.kt:333)
	at kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(ValueClassAwareCaller.kt:322)
	at kotlin.reflect.jvm.internal.KFunctionImpl.caller_delegate$lambda$4(KFunctionImpl.kt:103)
	at kotlin.reflect.jvm.internal.KFunctionImpl.accessor$KFunctionImpl$lambda1(KFunctionImpl.kt)
	at kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$1.invoke(Unknown Source)
	at kotlin.SafePublicationLazyImpl.getValue(LazyJVM.kt:125)
	at kotlin.reflect.jvm.internal.KFunctionImpl.getCaller(KFunctionImpl.kt:67)
	at kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(ReflectJvmMapping.kt:64)
	at kotlin.reflect.jvm.ReflectJvmMapping.findKFunction(ReflectJvmMapping.kt:155)
	at kotlin.reflect.jvm.ReflectJvmMapping.getKotlinFunction(ReflectJvmMapping.kt:144)
	at dev.bcmedeiros.kt78442.MainKt.main(main.kt:7)
	at dev.bcmedeiros.kt78442.MainKt.main(main.kt)
```