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
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
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
@StaticMetamodel(LoopActionUsageImpl.class)
public abstract class LoopActionUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<LoopActionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<LoopActionUsageImpl, Usage> usage;
	public static volatile CollectionAttribute<LoopActionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<LoopActionUsageImpl, Type> type;
	public static volatile ListAttribute<LoopActionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> output;
	public static volatile ListAttribute<LoopActionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<LoopActionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<LoopActionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<LoopActionUsageImpl, Differencing> ownedDifferencing;
	public static volatile CollectionAttribute<LoopActionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<LoopActionUsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isLibraryElement;
	public static volatile ListAttribute<LoopActionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<LoopActionUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> ownedFeature;
	public static volatile ListAttribute<LoopActionUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<LoopActionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<LoopActionUsageImpl, Behavior> actionDefinition;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> directedFeature;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> input;
	public static volatile ListAttribute<LoopActionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<LoopActionUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<LoopActionUsageImpl, String> shortName;
	public static volatile ListAttribute<LoopActionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<LoopActionUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<LoopActionUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<LoopActionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> feature;
	public static volatile ListAttribute<LoopActionUsageImpl, Element> member;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<LoopActionUsageImpl, Behavior> behavior;
	public static volatile SingularAttribute<LoopActionUsageImpl, String> effectiveName;
	public static volatile ListAttribute<LoopActionUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<LoopActionUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<LoopActionUsageImpl, String> aliasIds;
	public static volatile ListAttribute<LoopActionUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<LoopActionUsageImpl, PortionKind> portionKind;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<LoopActionUsageImpl, MetadataUsage> nestedMetadata;
	public static volatile ListAttribute<LoopActionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<LoopActionUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<LoopActionUsageImpl, Type> unioningType;
	public static volatile ListAttribute<LoopActionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<LoopActionUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<LoopActionUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<LoopActionUsageImpl, FeatureInverting> ownedFeatureInverting;
	public static volatile ListAttribute<LoopActionUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<LoopActionUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<LoopActionUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<LoopActionUsageImpl, Usage> variant;
	public static volatile ListAttribute<LoopActionUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<LoopActionUsageImpl, UUID> elementId;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<LoopActionUsageImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<LoopActionUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<LoopActionUsageImpl, Type> intersectingType;
	public static volatile ListAttribute<LoopActionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<LoopActionUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<LoopActionUsageImpl, Type> featuringType;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isComposite;
	public static volatile SingularAttribute<LoopActionUsageImpl, String> name;
	public static volatile ListAttribute<LoopActionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<LoopActionUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<LoopActionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<LoopActionUsageImpl, Disjoining> ownedDisjoining;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<LoopActionUsageImpl, Membership> membership;
	public static volatile SingularAttribute<LoopActionUsageImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<LoopActionUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<LoopActionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<LoopActionUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<LoopActionUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<LoopActionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<LoopActionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<LoopActionUsageImpl, Classifier> definition;
	public static volatile ListAttribute<LoopActionUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<LoopActionUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<LoopActionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<LoopActionUsageImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<LoopActionUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<LoopActionUsageImpl, Import> ownedImport;
	public static volatile ListAttribute<LoopActionUsageImpl, Type> differencingType;
	public static volatile CollectionAttribute<LoopActionUsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<LoopActionUsageImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<LoopActionUsageImpl, Intersecting> ownedIntersecting;

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
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String NESTED_VIEW = "nestedView";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
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
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String IS_ABSTRACT = "isAbstract";
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
	public static final String NAME = "name";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
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
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";

}

