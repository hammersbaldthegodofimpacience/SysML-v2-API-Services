package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AssociationStructure;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Interaction;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemFlowEnd;
import org.omg.sysml.metamodel.ItemFlowFeature;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Structure;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SuccessionFlowConnectionUsageImpl.class)
public abstract class SuccessionFlowConnectionUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Usage> usage;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Type> type;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> output;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Differencing> ownedDifferencing;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isImplied;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> ownedFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Behavior> actionDefinition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> directedFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> input;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> relatedElement;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, String> shortName;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Association> association;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> feature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> member;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Behavior> behavior;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, String> effectiveName;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, ItemFlowFeature> itemFlowFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, PartDefinition> partDefinition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, String> aliasIds;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, PortionKind> portionKind;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> relatedFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, MetadataUsage> nestedMetadata;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Type> unioningType;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, FeatureInverting> ownedFeatureInverting;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Usage> nestedUsage;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> source;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Expression> guardExpression;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Usage> variant;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, UUID> elementId;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Type> intersectingType;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Type> featuringType;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Step> effectStep;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, String> name;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> connectorEnd;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, AssociationStructure> connectionDefinition;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, ItemFlowEnd> itemFlowEnd;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Classifier> itemType;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Disjoining> ownedDisjoining;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Membership> membership;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> ownedRelatedElement;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Interaction> flowConnectionDefinition;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, Step> triggerStep;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isImpliedIncluded;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isNonunique;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> targetFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Classifier> definition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Import> ownedImport;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Structure> itemDefinition;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Element> target;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Type> differencingType;
	public static volatile CollectionAttribute<SuccessionFlowConnectionUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<SuccessionFlowConnectionUsageImpl, Boolean> isDirected;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Interaction> interaction;
	public static volatile ListAttribute<SuccessionFlowConnectionUsageImpl, Intersecting> ownedIntersecting;

	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String USAGE = "usage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_IMPLIED = "isImplied";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String ASSOCIATION = "association";
	public static final String IS_PORTION = "isPortion";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String MEMBER = "member";
	public static final String IS_REFERENCE = "isReference";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String ITEM_FLOW_FEATURE = "itemFlowFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String NESTED_METADATA = "nestedMetadata";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";
	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String SOURCE = "source";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String VARIANT = "variant";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_ORDERED = "isOrdered";
	public static final String ELEMENT_ID = "elementId";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String EFFECT_STEP = "effectStep";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String CONNECTION_DEFINITION = "connectionDefinition";
	public static final String ITEM_FLOW_END = "itemFlowEnd";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String ITEM_TYPE = "itemType";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String FLOW_CONNECTION_DEFINITION = "flowConnectionDefinition";
	public static final String TRIGGER_STEP = "triggerStep";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String DIRECTION = "direction";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String TARGET = "target";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String INTERACTION = "interaction";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";

}

