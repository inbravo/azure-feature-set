## Global Infrastructure
- **Region**: a set of datacenters deployed within a latency-defined perimeter, using a low-latency network
- **Availability Zone**: unique physical locations within a region. Each zone is made up of one or more datacenters
- Each Azure Region with Availability Zones made available will have at minimum 3 separate Zones

<p align="center"><img src="/images/azure/az-graphic-two.png" width="500"></p>

- [A Live map of the Microsoft Azure Regions](http://map.buildazure.com)

<p align="center"><img src="/images/cloudguru/regions.png" width="700"></p>

##  Management groups, subscriptions, resource groups, and resources

<p align="center"><img src="/images/azure/tree.png" width="700"></p>

- **Resource**: a manageable item that is available through Azure
- **Resource group**: a container that holds related resources for an Azure solution
- **Resource provider**: a service that supplies Azure resources e.g. Microsoft is a provider
- **Management groups**: organize subscriptions into containers. 10,000 management groups can be supported in a single directory

<p align="center"><img src="/images/azure/scope-levels.png" width="500"></p>

- **Azure Resource Manager (ARM)**:  Azure deployment and management service,  enabling you to create, update, and delete Azure resources
- **ARM template**: to implement infrastructure as code for your Azure solutions using a JSON file

<p align="center"><img src="/images/azure/nested-tiers-template.png" width="500"></p>


