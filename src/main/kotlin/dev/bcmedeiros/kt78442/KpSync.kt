package dev.bcmedeiros.kt78442

import java.time.LocalDate

class KpSync(
    val repository: KpRepository, // val with implicit getter
) {
    context(integration: KpIntegration)
    fun methodWithContextParameterAndValueClass(calendarDate: LocalDate, orgId: Org.Id) {
        // do nothing
    }
}