package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Interaction;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemFlowEnd;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SuccessionItemFlowImpl.class)
public abstract class SuccessionItemFlowImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> chainingFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> source;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Type> type;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> output;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Expression> guardExpression;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isSufficient;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, UUID> elementId;
	public static volatile ListAttribute<SuccessionItemFlowImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isLibraryElement;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isDerived;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isImplied;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, String> qualifiedName;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Documentation> documentation;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Type> intersectingType;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> endFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> directedFeature;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isEnd;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Type> featuringType;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> input;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isComposite;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> relatedElement;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Step> effectStep;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, String> name;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> connectorEnd;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, String> shortName;
	public static volatile ListAttribute<SuccessionItemFlowImpl, ItemFlowEnd> itemFlowEnd;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> ownedMember;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> ownedMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Classifier> itemType;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Association> association;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> membership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isPortion;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Step> triggerStep;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> targetFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> feature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> parameter;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> member;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Behavior> behavior;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, String> effectiveName;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> importedMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> ownedElement;
	public static volatile ListAttribute<SuccessionItemFlowImpl, String> aliasIds;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Import> ownedImport;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isAbstract;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> relatedFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> target;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Type> differencingType;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isDirected;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Type> unioningType;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Interaction> interaction;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Intersecting> ownedIntersecting;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, FeatureInverting> ownedFeatureInverting;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String IS_DERIVED = "isDerived";
	public static final String IS_IMPLIED = "isImplied";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String EFFECT_STEP = "effectStep";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String SHORT_NAME = "shortName";
	public static final String ITEM_FLOW_END = "itemFlowEnd";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String ITEM_TYPE = "itemType";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String ASSOCIATION = "association";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_PORTION = "isPortion";
	public static final String TRIGGER_STEP = "triggerStep";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String TARGET = "target";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String IS_DIRECTED = "isDirected";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String INTERACTION = "interaction";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";

}

