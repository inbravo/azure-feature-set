# Azure 900 + 104 + 303 + 304

## Key cloud concepts
-	**High availability**: The ability to keep services up and running for long periods of time, with very little downtime
-	**Scalability**: The ability to increase or decrease resources for any given workload
-	**Elasticity**: The ability to automatically or dynamically increase or decrease resources as needed
-	**Agility**: The ability to react quickly. Cloud services can allocate and deallocate resources quickly
-	**Fault tolerance**: The ability to remain up and running even in the event of a component (or service) no longer functioning
-	**Disaster recovery**: The ability to recover from an event which has taken down a cloud service
-	**Global reach**: The ability to reach audiences around the globe
-	**Customer latency capabilities**: Cloud services have the ability to deploy resources in datacenters around the globe, which addresses any customer latency issues
-	**Predictive cost considerations**: The ability for users to predict the costs they will incur for a particular cloud service
	-	Capital Expenditure (**CapEx**): This is the up front spending of money on physical infrastructure
	-	Operational Expenditure (**OpEx**): This is spending money on services or products
	- 	Cloud service providers operate on a **Consumption-Based Model**
		-	No upfront costs
		-	No need to purchase and manage costly infrastructure that may not be used to its fullest
		-	The ability to pay for additional resources when they are needed
		-	The ability to stop paying for resources that are no longer needed
-	**Technical skill requirements and considerations**: Getting a workload up and running with cloud services demands less technical resources
-	**Increased productivity**: On-site datacenters typically require a lot of hardware setup (otherwise known as racking and stacking), software patching, and other time-consuming IT management chores. Cloud computing eliminates the need for many of these tasks
-	**Security**: Cloud providers offer a broad set of policies, technologies, controls, and expert technology skills that can provide better security than most organizations can otherwise achieve

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

## Cloud computing (CSNA)
- Cloud computing providers offer a wide range of services. Typically, these services include:
	-	**Compute power**: succh as software applications working on virtual machines, containers or serverless computing
		-	VM is an emulation of a computer, just like your desktop or laptop you're using now
		-	Containers provide a consistent, isolated execution environment, similar to VMs except they don't require a guest operating system
		-	Serverless computing lets you run application code without creating, configuring, or maintaining a server
		<p align="center"><img src="/images/azure/compute.png" width="700"></p>
		
    -	**Storage** such as files and databases
    -	**Networking** such as secure connections between the cloud provider and your company
    -	**Analytics** such as visualizing telemetry and performance data

##  Virtual machines
- Control your instance using RDP or SSH
- 120+ instance sizes and 6 instance types 
- Burstable VMs—B1S
- Compute optimised—Fsv2
- General purpose—Dv3
- Memory optimised—Ev3
- GPU machines-N

<p align="center"><img src="/images/azure/vm-types.png" width="700"></p>

##	Dedicated hosts
- Physical servers dedicated to your organization
- VM series types: DS, ES and FS
- Not shared with other customers
- Provides Azure hybrid benefits
- Host level isolocation helps address compliance requirements
- You get control over the the server infra
- A host group is a resource that represents a collection of dedicated hosts
