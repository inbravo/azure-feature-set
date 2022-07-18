##  Azure Synapse Reference
- **SQL** used in enterprise data warehousing and **Spark Pool** used for big data
- **Data Explorer** for log and time series analytics
- **Pipelines** for data integration and ETL/ELT
- Integration with other Azure services such as Power BI, CosmosDB, and AzureML

<p align="center"><img src="https://docs.microsoft.com/en-us/azure/synapse-analytics/media/overview-what-is/synapse-architecture.png" width="900"></p>

- A **Synapse workspace** belongs to a specific region and has an associated ADLS Gen2 account and file system (for storing temporary data)
  - A workspace allows you to perform analytics with SQL and Apache spark. Resources available for SQL and Spark analytics are organized into SQL and Spark pools
  - A workspace has **Linked services**: essentially connection strings that define the connection information needed for the workspace to connect to external resources
- **Synapse SQL** is the ability to do T-SQL based analytics in Synapse workspace. 
  - Synapse SQL has two consumption models: dedicated SQL pools and serverless SQL pools
